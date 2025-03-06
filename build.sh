set -e
# Set JAVA_HOME to Java 17 for this script
export JAVA_HOME=$(/usr/libexec/java_home -v 21)
export PATH=$JAVA_HOME/bin:$PATH


mvn versions:set -DnewVersion=$1
mvn versions:update-child-modules

export CODEARTIFACT_AUTH_TOKEN=$(aws codeartifact get-authorization-token --domain fastays --query authorizationToken --output text)
mvn clean deploy -B -U -T 10 -s settings.xml

#mvn clean
#mvn release:prepare
#mvn release:perform -Darguments="-Dmaven.javadoc.skip=true"
#git push --tags
#git push origin main