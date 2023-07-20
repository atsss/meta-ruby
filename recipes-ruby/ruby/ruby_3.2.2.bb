# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   .bundle/gems/debug-1.7.1/LICENSE.txt
#   .bundle/gems/matrix-0.4.2/LICENSE.txt
#   .bundle/gems/net-ftp-0.2.0/LICENSE.txt
#   .bundle/gems/net-imap-0.3.4/LICENSE.txt
#   .bundle/gems/net-pop-0.1.2/LICENSE.txt
#   .bundle/gems/net-smtp-0.3.3/LICENSE.txt
#   .bundle/gems/power_assert-2.0.3/COPYING
#   .bundle/gems/power_assert-2.0.3/LEGAL
#   .bundle/gems/prime-0.1.2/LICENSE.txt
#   .bundle/gems/rbs-2.8.2/COPYING
#   .bundle/gems/rexml-3.2.5/LICENSE.txt
#   .bundle/gems/rss-0.2.9/LICENSE.txt
#   .bundle/gems/test-unit-3.5.7/COPYING
#   COPYING
#   COPYING.ja
#   LEGAL
#   lib/rubygems/util/licenses.rb
#   spec/bundler/commands/licenses_spec.rb
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "GPL-2.0-only & MIT & Unknown"
LIC_FILES_CHKSUM = "file://.bundle/gems/debug-1.7.1/LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5 \
                    file://.bundle/gems/matrix-0.4.2/LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5 \
                    file://.bundle/gems/net-ftp-0.2.0/LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5 \
                    file://.bundle/gems/net-imap-0.3.4/LICENSE.txt;md5=be5b6079b3c5e2d81f8a70b0d6f6b65b \
                    file://.bundle/gems/net-pop-0.1.2/LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5 \
                    file://.bundle/gems/net-smtp-0.3.3/LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5 \
                    file://.bundle/gems/power_assert-2.0.3/COPYING;md5=5da9af287d23f468ab552f44b58b01d2 \
                    file://.bundle/gems/power_assert-2.0.3/LEGAL;md5=1cff95a683df942bf2f148be74b5e0da \
                    file://.bundle/gems/prime-0.1.2/LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5 \
                    file://.bundle/gems/rake-13.0.6/MIT-LICENSE;md5=b217e3354f829a186a07233cd480fbee \
                    file://.bundle/gems/rbs-2.8.2/COPYING;md5=f90b6181f8f7d0a82707383d7475c432 \
                    file://.bundle/gems/rexml-3.2.5/LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5 \
                    file://.bundle/gems/rss-0.2.9/LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5 \
                    file://.bundle/gems/test-unit-3.5.7/COPYING;md5=89111acce0ad34f4602ed59b25852b7a \
                    file://.bundle/gems/typeprof-0.21.3/LICENSE;md5=5c506024215a5256794920ec280c48e0 \
                    file://COPYING;md5=5b8c87559868796979806100db3f3805 \
                    file://COPYING.ja;md5=4655d4fa248f5c5ad4bf0576c1ea4431 \
                    file://GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://LEGAL;md5=bcd74b47bbaf2051c5e49811a5faa97a \
                    file://lib/bundler/templates/newgem/LICENSE.txt.tt;md5=e68c591f45036ece59bc27a6241c60b5 \
                    file://lib/rubygems/util/licenses.rb;md5=11fabe3750b038fcac8caf7bf4464525 \
                    file://spec/bundler/commands/licenses_spec.rb;md5=1169b8dc3bd8eb35132478387aa0529f \
                    file://spec/mspec/LICENSE;md5=7c782aca57c884751ad49a748e65debb \
                    file://spec/ruby/LICENSE;md5=7c782aca57c884751ad49a748e65debb"

DEPENDS = "zlib openssl libyaml gdbm readline libffi ruby-native"

SRC_URI = "https://cache.ruby-lang.org/pub/ruby/3.2/ruby-${PV}.tar.gz"
SRC_URI[md5sum] = "eb6f18605e1e1be5dfb5b45f31bf6a93"
SRC_URI[sha1sum] = "670fce00d83771a1349b116e56a8a3b0ad323769"
SRC_URI[sha256sum] = "96c57558871a6748de5bc9f274e93f4b5aad06cd8f37befa0e8d94e7b8a423bc"
SRC_URI[sha384sum] = "1c7f6530460e316919a36d6f26e0d0b6ce59044a4a69109ef7fe9206f2f7488c6400714c4cc72cfb628e6632809b862d"
SRC_URI[sha512sum] = "bcc68f3f24c1c8987d9c80b57332e5791f25b935ba38daf5addf60dbfe3a05f9dcaf21909681b88e862c67c6ed103150f73259c6e35c564f13a00f432e3c1e46"

# NOTE: the following prog dependencies are unknown, ignoring: cl.exe c++ CC rustc dot doxygen dtrace ruby dsymutil codesign
# NOTE: the following library dependencies are unknown, ignoring: crypt execinfo z unwind procstat rt dl
#       (this is based on recipes that have previously been built and packaged)

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools ptest pkgconfig

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = "\
    --disable-install-rdoc \
    --disable-rpath \
"

FILES:${PN} += "${datadir}/rubygems"


do_install:append:class-target () {
    sed -i -e 's|${DEBUG_PREFIX_MAP}||g' \
        ${D}${libdir}/pkgconfig/*.pc
}
