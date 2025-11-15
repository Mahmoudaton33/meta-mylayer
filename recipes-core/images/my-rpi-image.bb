# Base this image on rpi-test-image
include recipes-core/images/rpi-test-image.bb

IMAGE_INSTALL:append = " systemd systemd-analyze systemd-serialgetty"
IMAGE_INSTALL:append = " psplash hello u-boot"
