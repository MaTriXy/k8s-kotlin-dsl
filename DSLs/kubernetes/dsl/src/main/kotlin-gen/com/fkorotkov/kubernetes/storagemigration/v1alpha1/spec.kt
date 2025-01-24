// GENERATED
package com.fkorotkov.kubernetes.storagemigration.v1alpha1

import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigration as v1alpha1_StorageVersionMigration
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigrationSpec as v1alpha1_StorageVersionMigrationSpec


fun  v1alpha1_StorageVersionMigration.`spec`(block: v1alpha1_StorageVersionMigrationSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1alpha1_StorageVersionMigrationSpec()
  }

  this.`spec`.block()
}

