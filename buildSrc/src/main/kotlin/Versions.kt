import kotlin.String
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val org_jetbrains_kotlin: String = "1.3.50"

    const val androidx_multidex: String = "2.0.0"

    const val com_android_tools_build_gradle: String = "3.6.0-beta03"

    const val digital_wup_android_maven_publish_gradle_plugin: String = "3.6.3"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0"

    const val navigation_safe_args_gradle_plugin: String = "2.1.0"

    const val constraintlayout: String = "1.1.3"

    const val lint_gradle: String = "26.6.0-beta03"

    const val slf4j_api: String = "1.7.29"

    const val material: String = "1.0.0"

    const val aapt2: String = "3.6.0-beta03-5836729"

    const val slf4j: String = "1.0.11"

    const val lib1: String = "1.0.0"

    /**
     * Current version: "6.0"
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "6.0"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
            id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
