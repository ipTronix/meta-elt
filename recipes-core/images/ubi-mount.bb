SUMMARY = "Add an init script that mounts ubifs"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYRIGHT;md5=349c872e0066155e1818b786938876a4"
RDEPENDS_${PN} = "initscripts"
PR = "r0"

SRC_URI = "file://ubifsmnt.sh \
	   file://COPYRIGHT \
	   "

CONFFILES_${PN} += "${sysconfdir}/init.d/ubifsmnt.sh"

do_install () {
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/ubifsmnt.sh ${D}${sysconfdir}/init.d/ubifsmnt.sh
        install -d ${D}${sysconfdir}/rcS.d

	ln -sf /etc/init.d/ubifsmnt.sh  ${D}${sysconfdir}/rcS.d/S90ubifsmnt
}

