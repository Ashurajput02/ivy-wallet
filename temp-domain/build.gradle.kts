import com.ivy.buildsrc.Hilt
import com.ivy.buildsrc.ThirdParty

apply<com.ivy.buildsrc.IvyComposePlugin>()

plugins {
    `android-library`
    `kotlin-android`
}

dependencies {
    Hilt()
    implementation(project(":common:main"))
    implementation(project(":core:data-model"))
    implementation(project(":app-base"))
    implementation(project(":core:ui"))
    implementation(project(":core:exchange-provider"))
    implementation(project(":common:main"))
    implementation(project(":design-system"))
    implementation(project(":navigation"))
    ThirdParty()

    implementation(project(":temp-persistence"))
    implementation(project(":temp-network"))
    implementation(project(":android-notifications"))
}