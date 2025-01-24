// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConnectionConfig as model_ConnectionConfig
import io.fabric8.openshift.api.model.ConnectionConfigNamespaceScoped as model_ConnectionConfigNamespaceScoped
import io.fabric8.openshift.api.model.HelmChartRepositorySpec as model_HelmChartRepositorySpec
import io.fabric8.openshift.api.model.ProjectHelmChartRepositorySpec as model_ProjectHelmChartRepositorySpec


fun  model_HelmChartRepositorySpec.`connectionConfig`(block: model_ConnectionConfig.() -> Unit = {}) {
  if(this.`connectionConfig` == null) {
    this.`connectionConfig` = model_ConnectionConfig()
  }

  this.`connectionConfig`.block()
}


fun  model_ProjectHelmChartRepositorySpec.`connectionConfig`(block: model_ConnectionConfigNamespaceScoped.() -> Unit = {}) {
  if(this.`connectionConfig` == null) {
    this.`connectionConfig` = model_ConnectionConfigNamespaceScoped()
  }

  this.`connectionConfig`.block()
}

