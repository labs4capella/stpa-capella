#!/bin/bash
if [ -z "$1" ] || [ -n "$2" ]
then
  echo "Usage: $(basename $0) <new_version>"
  exit 0
fi
ROOTDIR="$(dirname $0)/.."
OLDV="$(grep -Po '^\s*version="\K.*?(?=.qualifier")' ${ROOTDIR}/features/com.thalesgroup.mde.capella.stpa.docgen.feature/feature.xml)"
NEWV=$1
echo "Transitioning from version '${OLDV}' to version '${NEWV}'."
# ROOT POM FILE
POMFILE="${ROOTDIR}/releng/com.thalesgroup.mde.capella.stpa.configuration/pom.xml"
sed -i "s/<revision>${OLDV}/<revision>${NEWV}/g" "${POMFILE}"
echo "Updated root POM file."
# FEATURES
find "${ROOTDIR}/features/" -name "feature.xml" -exec sed -i "s/version=\"${OLDV}/version=\"${NEWV}/g" {} +
echo "Updated features."
# PLUGINS
find "${ROOTDIR}/plugins/" -name "MANIFEST.MF" -exec \
  sed -i "s/Bundle-Version:\s${OLDV}/Bundle-Version: ${NEWV}/g" {} +
echo "Updated plugins."
# CATEGORY
find "${ROOTDIR}/releng/" -name "category.xml" -exec \
  sed -i "s/${OLDV}.qualifier/${NEWV}.qualifier/g" {} +
echo "Updated categories."
