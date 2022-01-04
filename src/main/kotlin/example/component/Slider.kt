package example.component

import csstype.AlignItems
import csstype.px
import kotlinext.js.jso
import mui.icons.material.VolumeDown
import mui.icons.material.VolumeUp
import mui.material.Slider
import mui.material.Stack
import mui.system.ResponsiveStyleValue
import mui.system.Union
import react.FC
import react.Props
import react.dom.aria.ariaLabel
import react.dom.onChange
import react.useState

val SliderShowcase = FC<Props> {
    var value by useState(30)

    Stack {
        sx = jso {
            marginBottom = 1.px
            alignItems = AlignItems.center
        }
        // TODO: Unable to use `spacing` prop value correctly [MUI]
        spacing = 2.unsafeCast<ResponsiveStyleValue<dynamic>>()
        // TODO: Unable to use `direction` prop value correctly [MUI]
        direction = "row".unsafeCast<ResponsiveStyleValue<Union>>()

        VolumeDown()

        Slider {
            ariaLabel = "Volume"
            // TODO: Unable to use `value` prop correctly [MUI]
            asDynamic().value = value
            // TODO: Unable to use newValue as second parameter [MUI]
            onChange = { event -> value = 0 }
        }

        VolumeUp()
    }

    Slider {
        ariaLabel = "Disabled slider"
        // TODO: Unable to use `disabled` prop correctly [MUI]
        asDynamic().disabled = true
        // TODO: Need to use number `defaultValue` instead of string [MUI]
        defaultValue = 30.unsafeCast<String>()
    }
}