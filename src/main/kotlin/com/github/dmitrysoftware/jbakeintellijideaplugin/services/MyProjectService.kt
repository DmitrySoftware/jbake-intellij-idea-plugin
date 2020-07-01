package com.github.dmitrysoftware.jbakeintellijideaplugin.services

import com.intellij.openapi.project.Project
import com.github.dmitrysoftware.jbakeintellijideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
