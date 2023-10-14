import { createElement } from "react";
const React = { createElement };

import { StyleProperty } from "mendix/StyleProperty";

import { com_mendix_widget_native_feedback_Feedback } from "externalWidgets";
import { Placeholder } from "mendix/Placeholder";
import { addEnumerations, asPluginWidgets, t } from "mendix/native";

import * as styles from "../styles.js";

const { $com_mendix_widget_native_feedback_Feedback, $Placeholder } = asPluginWidgets({ com_mendix_widget_native_feedback_Feedback, Placeholder });

export const mainContent = (placeholder$Main) => [
    <$com_mendix_widget_native_feedback_Feedback key="l2.Atlas_Core.NativePhone_Default.feedback1"
        $widgetId="l2.Atlas_Core.NativePhone_Default.feedback1"
        allowScreenshot={true}
        sprintrapp={"4049b155-34d7-4f16-99bc-796282cebf41"}
        logo={undefined}
        style={StyleProperty({
            "styles": [ styles.com_mendix_widget_native_feedback_Feedback ]
        })} />,
    <$Placeholder key="l2.Atlas_Core.NativePhone_Default.Main"
        $widgetId="l2.Atlas_Core.NativePhone_Default.Main"
        content={placeholder$Main()} />
];

export const sidebar = () => null;

