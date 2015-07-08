COMPATIBLE_MACHINE_av108 = "av108"
BOARD_NAME_av108 = "av108"

do_install_prepend() {
	install -d ${S}/${FSBL_MISC_PATH}
	echo null > ${S}/${FSBL_MISC_PATH}/ps7_init_gpl.c
	echo null > ${S}/${FSBL_MISC_PATH}/ps7_init_gpl.h
}
