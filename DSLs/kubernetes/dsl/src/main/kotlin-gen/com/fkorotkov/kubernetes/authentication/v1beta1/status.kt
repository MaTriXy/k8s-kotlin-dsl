// GENERATED
package com.fkorotkov.kubernetes.authentication.v1beta1

import io.fabric8.kubernetes.api.model.authentication.v1beta1.SelfSubjectReview as v1beta1_SelfSubjectReview
import io.fabric8.kubernetes.api.model.authentication.v1beta1.SelfSubjectReviewStatus as v1beta1_SelfSubjectReviewStatus


fun  v1beta1_SelfSubjectReview.`status`(block: v1beta1_SelfSubjectReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1beta1_SelfSubjectReviewStatus()
  }

  this.`status`.block()
}

