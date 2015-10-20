require elt-rd-image.bb

DESCRIPTION = "A small image just capable of allowing a device to boot and \
is suitable for development work."

EXTRA_IMAGE_FEATURES = "debug-tweaks ssh-server-openssh "
IMAGE_INSTALL += " memtool pciutils libconfig ubi-mount "
