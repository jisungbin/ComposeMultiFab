<img src="https://user-images.githubusercontent.com/40740128/133895784-41d6dfec-f09c-4284-a2c0-5f254601f969.gif" align="right" width="33%"/>

# ComposeMultiFab

android multi-fab that made with jetpack-compose

-----

# Download [![](https://img.shields.io/maven-central/v/io.github.jisungbin/multifab)](https://search.maven.org/artifact/io.github.jisungbin/multifab)

```groovy
implementation "io.github.jisungbin:multifab:${version}"
```

# Usage

```kotlin
@Composable
fun MultiFloatingActionButton(
    modifier: Modifier = Modifier,
    items: List<MultiFabItem>,
    fabState: MutableState<MultiFabState> = rememberMultiFabState(),
    fabIcon: FabIcon,
    fabOption: FabOption = FabOption(),
    onFabItemClicked: (fabItem: MultiFabItem) -> Unit,
    stateChanged: (fabState: MultiFabState) -> Unit = {}
)
```

### MultiFabItem

```kotlin
/**
 * @param id Cannot be duplicated with the [id] value of another [MultiFabItem].
 */
data class MultiFabItem(
    val id: Int,
    @DrawableRes val iconRes: Int,
    val label: String = ""
)
```

### FabOption

```kotlin
/**
 * Affects all fabs including sub fabs.
 */
@Composable
fun FabOption(
    backgroundTint: Color = MaterialTheme.colors.secondary,
    iconTint: Color = contentColorFor(backgroundTint),
    showLabels: Boolean = false
): FabOption
```

### FabIcon

```kotlin
/**
 * Affects the main fab icon.
 *
 * @param iconRes [MultiFloatingActionButton]'s main icon
 * @param iconRotate If is not null, the [iconRes] rotates as much as [iconRotate] when [MultiFloatingActionButton] is in [MultiFabState.Expand] state.
 */
fun FabIcon(@DrawableRes iconRes: Int, iconRotate: Float? = null): FabIcon
```

---

# 🤗 Happy Coding :)

