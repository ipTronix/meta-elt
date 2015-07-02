# Default Xilinx BSP Machine settings

MACHINE_FEATURES_BACKFILL_CONSIDERED += "rtc"

# File System Configuration
IMAGE_FSTYPES ?= "tar.gz cpio cpio.gz.u-boot"
IMAGE_CLASSES += "image_types_uboot"

# Kernel Configuration
XILINX_DEFAULT_KERNEL := "linux-apissys"

PREFERRED_PROVIDER_virtual/kernel ??= "${XILINX_DEFAULT_KERNEL}"
PREFERRED_VERSION_linux-apissys ?= "3.15"

# U-Boot Configuration
PREFERRED_PROVIDER_virtual/bootloader ??= "u-boot-apissys"
PREFERRED_VERSION_u-boot-apissys ?= "2014.1"

UBOOT_SUFFIX ?= "img"
UBOOT_SUFFIX_zynqmp ?= "bin"
UBOOT_BINARY ?= "u-boot.${UBOOT_SUFFIX}"
UBOOT_BINARY_zynq ?= "u-boot-dtb.${UBOOT_SUFFIX}"

# Device Trees
MACHINE_ESSENTIAL_EXTRA_RDEPENDS_append_zynq += "device-tree"
MACHINE_ESSENTIAL_EXTRA_RDEPENDS_append_microblaze += "device-tree"

