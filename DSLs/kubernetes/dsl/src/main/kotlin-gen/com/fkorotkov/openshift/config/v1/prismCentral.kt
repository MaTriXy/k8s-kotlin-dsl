// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.NutanixPlatformSpec as v1_NutanixPlatformSpec
import io.fabric8.openshift.api.model.config.v1.NutanixPrismEndpoint as v1_NutanixPrismEndpoint


fun  v1_NutanixPlatformSpec.`prismCentral`(block: v1_NutanixPrismEndpoint.() -> Unit = {}) {
  if(this.`prismCentral` == null) {
    this.`prismCentral` = v1_NutanixPrismEndpoint()
  }

  this.`prismCentral`.block()
}

