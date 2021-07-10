package net.runelite.client.plugins.soxsautoclicker;

import net.runelite.client.config.*;

@ConfigGroup("soxsautoclicker")
public interface AutoClickerConfig extends Config
{

    @ConfigSection(
            keyName = "title",
            name = "Soxs' AutoClicker",
            description = "",
            position = 0
    )
    String title = "Soxs' AutoClicker";

    @ConfigItem(
            keyName = "toggle",
            name = "Toggle",
            description = "Toggles the auto-clicker.",
            position = 1,
            section = title
    )
    default Keybind toggle()
    {
        return Keybind.NOT_SET;
    }

    @ConfigSection(
            keyName = "clickerConfig",
            name = "Clicker Config",
            description = "",
            position = 5
    )
    String clickerConfig = "Clicker Config";

    @ConfigItem(
            keyName = "minDelay",
            name = "Minimum Delay (ms)",
            description = "Minimum delay between mouse clicks.",
            position = 6,
            section = clickerConfig
    )
    default int minDelay()
    {
        return 1000;
    }

    @ConfigItem(
            keyName = "maxDelay",
            name = "Maximum Delay (ms)",
            description = "Maximum delay between mouse clicks.",
            position = 7,
            section = clickerConfig
    )
    default int maxDelay()
    {
        return 2000;
    }

    @ConfigItem(
            keyName = "target",
            name = "Delay Target",
            description = "",
            position = 8,
            section = clickerConfig
    )
    default int target()
    {
        return 1500;
    }

    @ConfigItem(
            keyName = "deviation",
            name = "Delay Deviation",
            description = "",
            position = 9,
            section = clickerConfig
    )
    default int deviation()
    {
        return 100;
    }

    @ConfigItem(
            keyName = "weightedDistribution",
            name = "Weighted Distribution",
            description = "Shifts the random distribution towards the lower end at the target, otherwise it will be an even distribution",
            position = 10,
            section = clickerConfig
    )
    default boolean weightedDistribution()
    {
        return false;
    }

    @ConfigItem(
            keyName = "followMouse",
            name = "Follow Mouse",
            description = "Click at the mouse location.",
            position = 12,
            section = clickerConfig
    )
    default boolean followMouse()
    {
        return true;
    }

    @ConfigItem(
            keyName = "disableRealMouse",
            name = "Disable Real Mouse",
            description = "Disable the real mouse after the clicker has started, to prevent interference after setting it up.",
            position = 14,
            section = clickerConfig
    )
    default boolean disableRealMouse()
    {
        return true;
    }


    @ConfigItem(
            keyName = "chinBreakHandler",
            name = "ChinBreakHandler",
            description = "Enable Chin Break Handler",
            position = 14,
            section = clickerConfig
    )
    default boolean chinBreakHandler()
    {
        return false;
    }

    @ConfigItem(
            keyName = "disableUI",
            name = "Disable UI",
            description = "",
            position = 16,
            section = clickerConfig
    )
    default boolean disableUI()
    {
        return false;
    }

    @ConfigSection(
            keyName = "clickerFilters",
            name = "Clicker Filters",
            description = "",
            position = 17
    )
    String clickerFilters = "Clicker Filters";

    @ConfigItem(
            keyName = "skipOnMoving",
            name = "Skip When Moving",
            description = "",
            position = 18,
            section = clickerFilters
    )
    default boolean skipOnMoving()
    {
        return false;
    }

    @ConfigItem(
            keyName = "skipOnInteraction",
            name = "Skip On Interaction",
            description = "",
            position = 19,
            section = clickerFilters
    )
    default boolean skipOnInteraction()
    {
        return false;
    }




    @ConfigSection(
            keyName = "afkDelayTitle",
            name = "Random AFK",
            description = "",
            position = 20
    )
    String afkDelayTitle = "Random AFK";

    @Range(
            min = 0,
            max = 99
    )
    @ConfigItem(
            keyName = "frequencyAFK",
            name = "AFK Frequency (%)",
            description = "% chance to go AFK.",
            position = 21,
            section = afkDelayTitle
    )
    default int frequencyAFK()
    {
        return 3;
    }

    @ConfigItem(
            keyName = "minDelayAFK",
            name = "Minimum Delay (ms)",
            description = "Minimum AFK delay.",
            position = 22,
            section = afkDelayTitle
    )
    default int minDelayAFK()
    {
        return 5000;
    }

    @ConfigItem(
            keyName = "maxDelayAFK",
            name = "Maximum Delay (ms)",
            description = "Maximum AFK delay.",
            position = 23,
            section = afkDelayTitle
    )
    default int maxDelayAFK()
    {
        return 20000;
    }

    @Range(
            min = 5,
            max = 9
    )
    @ConfigItem(
            keyName = "weightSkewAFK",
            name = "AFK Skew (Tightness)",
            description = "The degree to which the AFK random weights cluster around the mode of the distribution; higher values mean tighter clustering.",
            position = 24,
            section = afkDelayTitle
    )
    default int weightSkewAFK()
    {
        return 8;
    }

    @Range(
            min = -10,
            max = 10
    )
    @ConfigItem(
            keyName = "weightBiasAFK",
            name = "AFK Bias (Offset)",
            description = "The tendency of the AFK mode to reach the min, max or midpoint value; positive values bias toward max, negative values toward min.",
            position = 25,
            section = afkDelayTitle
    )
    default int weightBiasAFK()
    {
        return 8;
    }

}
