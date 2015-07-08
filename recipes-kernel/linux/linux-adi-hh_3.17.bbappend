FILESEXTRAPATHS_prepend := "${THISDIR}/linux-adi-hh/${MACHINE}:"
SRC_URI += " \
	file://defconfig \
	file://av108.dts \
                "

KCONFIG_MODE="--alldefconfig"
