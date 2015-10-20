FILESEXTRAPATHS_prepend := "${THISDIR}/linux-adi-hh/${MACHINE}:"
SRC_URI += " \
		file://defconfig \
		file://000-enable-max-zoneorder.patch \
                "

KCONFIG_MODE="--alldefconfig"
