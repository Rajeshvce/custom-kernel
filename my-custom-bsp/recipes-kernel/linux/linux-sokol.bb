# ---------------------------------------------------------------------------------------------------------------------
# Sokol kernel for Mentor Embedded Linux
# ---------------------------------------------------------------------------------------------------------------------
# This material contains trade secrets or otherwise confidential information owned by Siemens Industry Software Inc.
# or its affiliates (collectively, "SISW"), or its licensors. Access to and use of this information is strictly
# limited as set forth in the Customer's applicable agreements with SISW.
# ---------------------------------------------------------------------------------------------------------------------
# Unpublished work. Copyright 2022 Siemens
# ---------------------------------------------------------------------------------------------------------------------
# SPDX-License-Identifier: MIT
# ---------------------------------------------------------------------------------------------------------------------
 
inherit mel-kernel-package
 
BASE_KERNEL = "5.10"
PL          = "158"
PV          = "${BASE_KERNEL}.${PL}"
CHANGELOG_V = "${PV}+mel1"
MAINTAINER  = "Mentor Embedded <embedded_support@mentor.com>"
 
S           = "${WORKDIR}/linux-${BASE_KERNEL}-${BASE_KERNEL}.${PL}"
 
SRC_URI     = "apt://linux-${BASE_KERNEL} \
               file://gpio.cfg            \
"
 
KERNEL_CONFIG_FRAGMENTS = "gpio.cfg"
