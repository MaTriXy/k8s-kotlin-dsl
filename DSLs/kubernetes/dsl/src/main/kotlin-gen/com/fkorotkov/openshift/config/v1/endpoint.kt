// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.NutanixPrismElementEndpoint as v1_NutanixPrismElementEndpoint
import io.fabric8.openshift.api.model.config.v1.NutanixPrismEndpoint as v1_NutanixPrismEndpoint


fun  v1_NutanixPrismElementEndpoint.`endpoint`(block: v1_NutanixPrismEndpoint.() -> Unit = {}) {
  if(this.`endpoint` == null) {
    this.`endpoint` = v1_NutanixPrismEndpoint()
  }

  this.`endpoint`.block()
}

