// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicy as v1alpha1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyStatus as v1alpha1_ValidatingAdmissionPolicyStatus


fun  v1alpha1_ValidatingAdmissionPolicy.`status`(block: v1alpha1_ValidatingAdmissionPolicyStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1alpha1_ValidatingAdmissionPolicyStatus()
  }

  this.`status`.block()
}

