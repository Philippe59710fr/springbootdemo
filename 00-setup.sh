echo "execute this script with souce setup.sh"
apt install maven openjdk-8-jdk-headless
yum install maven java-1.8.0-openjdk-headless
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
chmod -R g+w .
chgrp -R dev .
