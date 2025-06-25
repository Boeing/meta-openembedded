SUMMARY = "Curl for People - C++ Requests"
DESCRIPTION = "Curl for People C++ Requests is a simple wrapper around \
    libcurl inspired by the excellent Python Requests project."
HOMEPAGE = "https://docs.libcpr.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08beaae5deae1c43c065592da8f38095"

DEPENDS = "curl openssl"

SRC_URI = "git://github.com/libcpr/cpr.git;protocol=https;branch=1.11.x"
SRCREV = "bb01c8db702fb41e5497aee9c0559ddf4bf13749"


inherit cmake

# building tests is currently using FetchContent for mongoose
EXTRA_OECMAKE += "\
    -DCPR_USE_SYSTEM_CURL=ON \
    -DCPR_BUILD_TESTS=OFF \
"

BBCLASSEXTEND = "native nativesdk"
