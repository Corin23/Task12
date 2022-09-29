#
#
DESCRIPTION = "txtproc preinstalled on machine."
SECTION = "txtproc"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8" 

FILESEXTRAPATHS:prepend = "${THISDIR}/${PN}-${PV}:"

SRCREV = ""
SRC_URI = "file://txtproc-${PV}.tar.gz"

TARGET_CC_ARCH += "${LDFLAGS}"
DEPENDS = "curl"

do_install(){
install -m 0755 -d ${D}${bindir} ${D}${docdir}/txtproc
install -m 0777 ${S}/txtproc ${D}${bindir}
}

#S = "${WORKDIR}/txtproc-${PV}"

#inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""
