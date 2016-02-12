#!/bin/bash
JBOSS_DIR="/home/tyler/programs/wildfly-10.0.0.Final"
JBOSS_BIND_ADDR="0.0.0.0"

APP_NAME="helloWorld"
APP_DEPLOY_NAME="helloWorld.war"
APP_SRC_DIR="/home/tyler/code/helloWorld/"
APP_DEPLOY_SRC=$APP_SRC_DIR"target/"$APP_NAME
APP_DEPLOY_DEST=$JBOSS_DIR"/standalone/deployments"/$APP_DEPLOY_NAME

#cd $APP_SRC_DIR
#mvn -DskipTests clean compile install 

echo $APP_DEPLOY_DEST
sudo rm -rf $JBOSS_DIR/standalone/deployments/$APP_DEPLOY_NAME
sudo rm -rf $JBOSS_DIR/standalone/deployments/$APP_DEPLOY_NAME.*
cp -r $APP_DEPLOY_SRC $APP_DEPLOY_DEST
touch $JBOSS_DIR/standalone/deployments/$APP_DEPLOY_NAME.dodeploy
sudo rm -rf $JBOSS_DIR/standalone/data/timer-service-data

#export JAVA_OPTS="-XX:MaxPermSize=1024m -Xms1024m -Xmx2048m -Xrunjdwp:transport=dt_socket,address=8787,server=y,suspend=n"
$JBOSS_DIR/bin/standalone.sh -b $JBOSS_BIND_ADDR --server-config="../../../../../tyler/code/helloWorld/config/standalone-full.xml" -P $APP_SRC_DIR"config/tkc.config"
