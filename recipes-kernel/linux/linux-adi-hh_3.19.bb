SRCREV := "7f929ec17297ee75e370f9ba297030c63c1c2c74"
#SRCREV = "${AUTOREV}"
KBRANCH := "2015_R1"
LINUX_VERSION := "3.19"

# This version extension should match CONFIG_LOCALVERSION in defconfig
LINUX_VERSION_EXTENSION = ""
PV = "${LINUX_VERSION}${LINUX_VERSION_EXTENSION}+git${SRCPV}"

# Sources
SRC_URI = "git://github.com/analogdevicesinc/linux.git;protocol=https;branch=${KBRANCH}" 

SRCREV_machine ?= "${SRCREV}"

require recipes-kernel/linux/linux-yocto.inc

DESCRIPTION = "Analog Devices Linux Kernel"

# Setup for Zynq architectures
COMPATIBLE_MACHINE_zynq = "zynq"

COMPATIBLE_MACHINE_${MACHINE} = "${MACHINE}"

require linux-xilinx-configs.inc
require linux-xilinx-machines.inc

