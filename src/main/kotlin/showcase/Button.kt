package showcase

import mui.material.Button
import react.Props
import react.fc

val Button = fc<Props> {
    Button {
        attrs.variant = "text"
        +"Text"
    }
    Button {
        attrs.variant = "contained"
        +"Contained"
    }
    Button {
        attrs.variant = "outlined"
        +"Outlined"
    }
}