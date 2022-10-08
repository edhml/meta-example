#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "https://github.com/edhml/meta-example/tree/master/recipes-example/bbexample/bbexample-lt-1.0/bbexample-${PV}.tar.gz"

SRC_URI[md5sum] = "d653454d70f0effce3f11dd4579dd7ea"
SRC_URI[sha256sum] = "c2263368c7633d95afbc4f388d611bb2a5010131beff61d723291eb882655d96"

# Make sure our source directory (for the build) matches the directory structure in the tarball
S = "${WORKDIR}/bbexample-${PV}"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

