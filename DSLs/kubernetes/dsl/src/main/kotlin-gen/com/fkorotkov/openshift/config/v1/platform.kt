// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.DNSPlatformSpec as v1_DNSPlatformSpec
import io.fabric8.openshift.api.model.config.v1.DNSSpec as v1_DNSSpec
import io.fabric8.openshift.api.model.config.v1.IngressPlatformSpec as v1_IngressPlatformSpec
import io.fabric8.openshift.api.model.config.v1.LoadBalancer as v1_LoadBalancer


fun  v1_DNSSpec.`platform`(block: v1_DNSPlatformSpec.() -> Unit = {}) {
  if(this.`platform` == null) {
    this.`platform` = v1_DNSPlatformSpec()
  }

  this.`platform`.block()
}


fun  v1_LoadBalancer.`platform`(block: v1_IngressPlatformSpec.() -> Unit = {}) {
  if(this.`platform` == null) {
    this.`platform` = v1_IngressPlatformSpec()
  }

  this.`platform`.block()
}

