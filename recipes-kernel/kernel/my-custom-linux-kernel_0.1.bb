DESCRIPTION = "Linux Kernel Recipe for Custom Raspberry Pi Kernel"
SECTION = "kernel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit kernel

SRC_URI = "https://cdn.kernel.org/pub/linux/kernel/v6.x/linux-6.17.7.tar.xz;name=kernel"
SRC_URI[kernel.sha256sum] = "ddf2ea0d4439e1d57136be3623102af9458f601f5b1cb77e83246e88aea09d0e"
PREFERRED_PROVIDER_virtual/kernel = "my-custom-linux-kernel"

S = "${WORKDIR}/linux-6.17.7"
KERNEL_DEFCONFIG = "defconfig"