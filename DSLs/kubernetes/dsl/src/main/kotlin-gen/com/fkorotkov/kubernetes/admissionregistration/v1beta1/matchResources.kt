// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MatchResources as v1beta1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingSpec as v1beta1_ValidatingAdmissionPolicyBindingSpec


fun  v1beta1_ValidatingAdmissionPolicyBindingSpec.`matchResources`(block: v1beta1_MatchResources.() -> Unit = {}) {
  if(this.`matchResources` == null) {
    this.`matchResources` = v1beta1_MatchResources()
  }

  this.`matchResources`.block()
}

