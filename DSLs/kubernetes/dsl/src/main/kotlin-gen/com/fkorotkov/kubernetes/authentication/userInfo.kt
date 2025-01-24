// GENERATED
package com.fkorotkov.kubernetes.authentication

import io.fabric8.kubernetes.api.model.authentication.SelfSubjectReviewStatus as authentication_SelfSubjectReviewStatus
import io.fabric8.kubernetes.api.model.authentication.UserInfo as authentication_UserInfo


fun  authentication_SelfSubjectReviewStatus.`userInfo`(block: authentication_UserInfo.() -> Unit = {}) {
  if(this.`userInfo` == null) {
    this.`userInfo` = authentication_UserInfo()
  }

  this.`userInfo`.block()
}

