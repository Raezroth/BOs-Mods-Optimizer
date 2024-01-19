/*
 * Copyright 2022 Markus Bordihn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.markusbordihn.modsoptimizer.config;

import java.util.Arrays;
import java.util.List;

public class ClientModsDatabase {

  /** List of client side mods, which are confirmed to be client-side only! */
  private static final List<String> clientSideModsList =
      Arrays.asList(
          "3dskinlayers",
          "advanced-tooltips",
          "advancements_tracker",
          "advancementscreenshot",
          "ambientsounds",
          "amecs",
          "animatica",
          "athena-ctm",
          "atum",
          "audio-extension-for-fancymenu",
          "auth-me",
          "auto-third-person",
          "auudio",
          "beautifiedchatclient",
          "bedrockwaters",
          "better-animations-collection",
          "better-beds",
          "better-end-sky",
          "better-mount-hud",
          "better-ping-display-fabric",
          "better-third-person",
          "better_loading_screen",
          "betteradvancements",
          "betteranimalmodels",
          "betterbiomeblend",
          "bettercommandblockui",
          "betterf3",
          "betterfpsdist",
          "betterhurtcam",
          "bettermodsbutton",
          "bettersigns",
          "betterstats",
          "bettertaskbar",
          "betterthirdperson",
          "bettertitlescreen",
          "blur",
          "blur-fabric",
          "boat-item-view",
          "bobby",
          "boosted-brightness",
          "borderless-mining",
          "brb",
          "camera-utils",
          "capes",
          "catalogue",
          "cave-dust",
          "cem",
          "charmonium",
          "chat-heads",
          "chatting",
          "cherished-worlds",
          "chest-tracker",
          "chunkanimator",
          "chunks-fade-in",
          "cit-resewn",
          "clear-skies",
          "cleardespawn",
          "clearwater",
          "client-tweaks",
          "clienttweaks",
          "colormatic",
          "continuity",
          "controlify",
          "controlling",
          "cosmetica",
          "craftify",
          "craftpresence",
          "ctrl-q",
          "cull-leaves",
          "cull-less-leaves",
          "cullleaves",
          "customskinloader",
          "dailydad",
          "dark-loading-screen",
          "dashloader",
          "dcwa",
          "default-options",
          "detail-armor-bar",
          "ding",
          "distanthorizons",
          "distinguished-potions",
          "drawerfps",
          "drippy-loading-screen",
          "drippyloadingscreen",
          "dripsounds-fabric",
          "dynamic-fps",
          "dynamiccrosshair",
          "dynamicsurroundings_remasteredfabric",
          "ears",
          "eating-animation",
          "eatinganimation",
          "ebe",
          "elytra-flight-hud",
          "emiffect",
          "emitrades",
          "emoji-type",
          "enchantment-descriptions",
          "enhanced-attack-indicator",
          "entity-model-features",
          "entity_texture_features",
          "entityculling",
          "entitytexturefeatures",
          "equipment-compare",
          "essential",
          "evergreenhud",
          "exordium",
          "explosive-enhancement",
          "extendedclouds",
          "extrasounds",
          "extremeSoundMuffler",
          "fabricskyboxes",
          "fabricskyboxes-interop",
          "fabrishot",
          "fadeless",
          "fallingleaves",
          "fancymenu",
          "farsight",
          "farsight_view",
          "fastanim",
          "fastquit",
          "feytweaks",
          "first-person-model",
          "firstperson",
          "flickerfix",
          "fm_audio_extension",
          "forcecloseworldloadingscreen",
          "forgetmechunk",
          "fps",
          "fpsdisplay",
          "fpsreducer",
          "freecam",
          "fusion-connected-textures",
          "gamemenumodoption",
          "gamemenuremovegfarb",
          "gamma-utils",
          "guiclock",
          "guicompass",
          "guifollowers",
          "held-item-info",
          "hiddenrecipebook",
          "highlight",
          "highlighter",
          "hold-that-chunk",
          "hytils",
          "i18nupdatemod",
          "iknowwhatimdoing",
          "immediatelyfast",
          "in-game-account-switcher",
          "indium",
          "inventory-profiles-next",
          "invmove",
          "invmove_compat",
          "iris",
          "item-highlighter",
          "item-model-fix",
          "itemborders",
          "itemphysiclite",
          "itemsdontbreak",
          "itemzoom",
          "justzoom",
          "lambdabettergrass",
          "lambdynamiclights",
          "language-reload",
          "leave-my-bars-alone",
          "legendary-tooltips",
          "legendarytooltips",
          "letsleepingdogslie",
          "libipn",
          "light-overlay",
          "litematica-printer",
          "load-my-resources",
          "loadmyresources",
          "logical-zoom",
          "low-fire",
          "macos-input-fixes",
          "main-menu-credits",
          "make_bubbles_pop",
          "mcwifipnp",
          "mcwifipnp",
          "medievalmusic",
          "merchant-markers",
          "midnightlib",
          "minimap",
          "mixmetica",
          "modernworldcreation",
          "modmenu",
          "modnametooltip",
          "morechathistory",
          "moreculling",
          "moreoverlays",
          "mouse-tweaks",
          "mousetweaks",
          "myserveriscompatible",
          "namepain",
          "neat",
          "nebs",
          "no-resource-pack-warnings",
          "no-telemetry",
          "no-telemetry",
          "no_fog",
          "not-enough-animations",
          "notenoughanimations",
          "notes",
          "noxesium",
          "nvidium",
          "oculus",
          "ok-zoomer",
          "optigui",
          "paperdoll",
          "particlesenhanced",
          "physicsmod",
          "pickupnotifier",
          "playerhealthindicators",
          "presence-footsteps",
          "puzzle",
          "raised",
          "reauth",
          "rebind-narrator",
          "reeses-sodium-options",
          "replanter",
          "replaymod",
          "resourcify",
          "reward-claim",
          "roughly-searchable",
          "rrls",
          "rubidium",
          "rubidium-extra",
          "screenscale",
          "screenshot-to-clipboard",
          "searchables",
          "shutupexperimentalsettings",
          "skyguide",
          "smooth-swapping",
          "smoothboot",
          "sodium",
          "sodium-extra",
          "sodium-shadowy-path-blocks",
          "spyglass_improvements",
          "status-effect-bars",
          "stendhal",
          "stylisheffects",
          "textbook",
          "textrues-rubidium-options",
          "tipthescales",
          "title-fixer",
          "toastcontrol",
          "tool-stats",
          "tooltipfix",
          "tooltipscroller",
          "torohealth",
          "totemcounter",
          "transparent",
          "travelers-titles",
          "uiinputundo",
          "ukulib",
          "visuality",
          "voxelmap-updated",
          "vulkanmod",
          "wakes",
          "wavey-capes",
          "waveycapes",
          "whats-that-slot",
          "worldtime",
          "wynntils",
          "zmedievalmusic",
          "zoomify");

  protected ClientModsDatabase() {}

  public static List<String> getClientSideModsList() {
    return clientSideModsList;
  }
}
