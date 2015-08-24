require recipes-bsp/u-boot/u-boot.inc

XILINX_EXTENSION = "-xilinx"

UBRANCH ?= "av108_integration"
SRC_URI = "git://github.com/ApisSys/u-boot-xlnx-ap6.git;protocol=git;branch=${UBRANCH} \
           file://000-fix_env_location.patch \
	"
SRC_URI[md5sum] = "025bf9f768cbcb1a165dbe1a110babfb"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCREV = "av108_integration"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

S = "${WORKDIR}/git"
PACKAGE_ARCH = "${MACHINE_ARCH}"

do_compile_append() {
    # link u-boot-dtb.img to u-boot.img.
    if [ ! -e ${B}/u-boot-dtb.img ]; then
        ln -sf u-boot.img ${B}/u-boot-dtb.img
    fi
}

