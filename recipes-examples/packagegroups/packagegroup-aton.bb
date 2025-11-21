SUMMARY = " ATON package group "


inherit packagegroup

RDEPENDS:${PN} = " \
    util-linux-lsblk \
    util-linux-fdisk \
    usbutils \
    pciutils \
"