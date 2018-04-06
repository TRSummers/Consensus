#!/usr/bin/env bash

if [ "$USER" == "z0029p8" ]; then
    TGTDEVJUMPUSER="tward"
elif [ "$USER" == "z0021nd" ]; then
    TGTDEVJUMPUSER="tsummers"
else
    TGTDEVJUMPUSER="$USER"
fi

APP_HOST="cdsprf0-ccpam-i01"
DB_HOST="cdsprf0-ccpam-d"
DB_USER="ccpam"
DB_NAME="pamdb"
DB_TABLES="wf_workflowsession_variable"
DB_PASSWORD="4321fdsa"
echo "Cleaning PAM DB..."
for DB_TABLE in ${DB_TABLES} ; do
    ssh ${TGTDEVJUMPUSER}@tgt-dev-jump.consensuscorpdev.com "ssh -t -t ${APP_HOST} \"sudo mysql -u ${DB_USER} -p${DB_PASSWORD} -h ${DB_HOST} -e \\\"use ${DB_NAME}; truncate table ${DB_TABLE};\\\"\""
done