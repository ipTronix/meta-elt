FILESEXTRAPATHS_prepend := "${THISDIR}/linux-adi-hh/${MACHINE}:"
SRC_URI += " \
	file://defconfig \
                "

KCONFIG_MODE="--alldefconfig"
