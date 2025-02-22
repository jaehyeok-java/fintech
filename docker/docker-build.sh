#!/bin/sh

export JAVA_HOME="$HOME/.sdkman/candidates/java/21.0.6-zulu"
echo "Using JAVA_HOME: $JAVA_HOME"

# Setting versions
VERSION='1.0.1'

cd ..
./gradlew clean build -x test

ROOT_PATH=`pwd`
echo $ROOT_PATH

echo 'api Docker Image build...'
cd $ROOT_PATH/api && docker build -t api:$VERSION .
echo 'api Docker Image build... Done'

echo 'consumer Docker Image build...'
cd $ROOT_PATH/consumer && docker build -t consumer:$VERSION .
echo 'consumer Docker Image build... Done'

echo 'css Docker Image build...'
cd $ROOT_PATH/css && docker build -t css:$VERSION .
echo 'css Docker Image build... Done'

echo 'nginx Docker Image build...'
cd $ROOT_PATH/nginx && docker build -t nginx:$VERSION .
echo 'nginx Docker Image build... Done'
