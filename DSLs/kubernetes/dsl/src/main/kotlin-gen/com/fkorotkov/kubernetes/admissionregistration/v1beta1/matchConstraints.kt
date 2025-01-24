// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MatchResources as v1beta1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec as v1beta1_ValidatingAdmissionPolicySpec


fun  v1beta1_ValidatingAdmissionPolicySpec.`matchConstraints`(block: v1beta1_MatchResources.() -> Unit = {}) {
  if(this.`matchConstraints` == null) {
    this.`matchConstraints` = v1beta1_MatchResources()
  }

  this.`matchConstraints`.block()
}

