# Base this image on core-image-minimal
require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL:append = " hello"
IMAGE_INSTALL:append = " packagegroup-aton"

