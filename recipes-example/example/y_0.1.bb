#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "University informations"
SECTION = "About University"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://pwr.c"

S = "${WORKDIR}"

do_compile() {
	     ${CC} pwr.c -o pwr
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 pwr ${D}${bindir}
}
