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
echo "Cleaning PAM DB..."
SQL_QUERY="use pamdb; truncate table wf_workflowsession_variable;"
MYSQL_COMMAND="sudo mysql -u ccpam -p4321fdsa -h ${DB_HOST} -e \\\\\\\"${SQL_QUERY}\\\\\\\""
INNER_SSH_COMMAND="ssh -t -t ${APP_HOST} \\\"${MYSQL_COMMAND}\\\""
echo ssh ${TGTDEVJUMPUSER}@tgt-dev-jump.consensuscorpdev.com "\"${INNER_SSH_COMMAND}\""