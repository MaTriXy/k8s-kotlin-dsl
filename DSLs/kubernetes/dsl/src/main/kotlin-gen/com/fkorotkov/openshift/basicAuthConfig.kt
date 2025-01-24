// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConnectionConfigNamespaceScoped as model_ConnectionConfigNamespaceScoped
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  model_ConnectionConfigNamespaceScoped.`basicAuthConfig`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`basicAuthConfig` == null) {
    this.`basicAuthConfig` = v1_SecretNameReference()
  }

  this.`basicAuthConfig`.block()
}

