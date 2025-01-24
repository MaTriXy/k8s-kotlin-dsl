// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.MatchResources as v1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingSpec as v1_ValidatingAdmissionPolicyBindingSpec


fun  v1_ValidatingAdmissionPolicyBindingSpec.`matchResources`(block: v1_MatchResources.() -> Unit = {}) {
  if(this.`matchResources` == null) {
    this.`matchResources` = v1_MatchResources()
  }

  this.`matchResources`.block()
}

