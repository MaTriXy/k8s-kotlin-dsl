// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicy as v1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyStatus as v1_ValidatingAdmissionPolicyStatus


fun  v1_ValidatingAdmissionPolicy.`status`(block: v1_ValidatingAdmissionPolicyStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_ValidatingAdmissionPolicyStatus()
  }

  this.`status`.block()
}

