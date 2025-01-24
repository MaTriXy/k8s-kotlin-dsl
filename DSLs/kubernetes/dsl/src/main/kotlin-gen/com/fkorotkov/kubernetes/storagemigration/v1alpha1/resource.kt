// GENERATED
package com.fkorotkov.kubernetes.storagemigration.v1alpha1

import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.GroupVersionResource as v1alpha1_GroupVersionResource
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigrationSpec as v1alpha1_StorageVersionMigrationSpec


fun  v1alpha1_StorageVersionMigrationSpec.`resource`(block: v1alpha1_GroupVersionResource.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = v1alpha1_GroupVersionResource()
  }

  this.`resource`.block()
}

