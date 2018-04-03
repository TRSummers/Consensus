#!/usr/bin/env bash

if [ "$USER" == "z0029p8" ]; then
    TGTDEVJUMPUSER="tward"
elif [ "$USER" == "z0021nd" ]; then
    TGTDEVJUMPUSER="tsummers"
else
    TGTDEVJUMPUSER="$USER"
fi

ENVIRONMENTS="cdsprf0"
MULELOGS="sudo rm -rf /opt/mule-enterprise-standalone/logs/*"
APIHISTORY="sudo rm -rf /var/appdata/apihistory/*"
TOMCATLOGS="sudo rm -rf /var/log/tomcat/*"

echo "Cleaning ESB logs and api history..."
COMPONENT="ccesb"
INSTANCES="i01 i02 i03"
for ENV in ${ENVIRONMENTS} ; do
    for COMP in ${COMPONENT} ; do
        for INST in ${INSTANCES} ; do
            ssh ${TGTDEVJUMPUSER}@tgt-dev-jump.consensuscorpdev.com "ssh -t -t ${ENV}"-"${COMP}"-"${INST} \"$MULELOGS && $APIHISTORY\""
        done
    done
done

echo "Cleaning API GW logs..."
COMPONENT="ccapi"
INSTANCES="i01 i02 i03"
for ENV in ${ENVIRONMENTS} ; do
    for COMP in ${COMPONENT} ; do
        for INST in ${INSTANCES} ; do
            ssh ${TGTDEVJUMPUSER}@tgt-dev-jump.consensuscorpdev.com "ssh -t -t ${ENV}"-"${COMP}"-"${INST} \"$MULELOGS\""
        done
    done
done

echo "Cleaning PAM logs..."
COMPONENT="ccpam"
INSTANCES="i01 i02 i03"
for ENV in ${ENVIRONMENTS} ; do
    for COMP in ${COMPONENT} ; do
        for INST in ${INSTANCES} ; do
            ssh ${TGTDEVJUMPUSER}@tgt-dev-jump.consensuscorpdev.com "ssh -t -t ${ENV}"-"${COMP}"-"${INST} \"$TOMCATLOGS\""
        done
    done
done

echo "Cleaning CR logs..."
COMPONENT="cccar"
INSTANCES="i01"
for ENV in ${ENVIRONMENTS} ; do
    for COMP in ${COMPONENT} ; do
        for INST in ${INSTANCES} ; do
            ssh ${TGTDEVJUMPUSER}@tgt-dev-jump.consensuscorpdev.com "ssh -t -t ${ENV}"-"${COMP}"-"${INST} \"$TOMCATLOGS\""
        done
    done
done