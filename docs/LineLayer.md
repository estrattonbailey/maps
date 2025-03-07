<!-- This file was autogenerated from LineLayer.tsx do not modify -->

```tsx
import { LineLayer } from '@rnmapbox/maps';

LineLayer
```
LineLayer is a style layer that renders one or more stroked polylines on the map.

## props

  
### id

```tsx
string
```
_required_
A string that uniquely identifies the source in the style to which it is added.


  
### existing

```tsx
boolean
```
The id refers to en existing layer in the style. Does not create a new layer.


  
### sourceID

```tsx
string
```
The source from which to obtain the data to style.
If the source has not yet been added to the current style, the behavior is undefined.
Inferred from parent source only if the layer is a direct child to it.

  _defaults to:_ `MapboxGL.StyleSource.DefaultSourceID`

  
### sourceLayerID

```tsx
string
```
Identifier of the layer within the source identified by the sourceID property from which the receiver obtains the data to style.


  
### aboveLayerID

```tsx
string
```
Inserts a layer above aboveLayerID.


  
### belowLayerID

```tsx
string
```
Inserts a layer below belowLayerID


  
### layerIndex

```tsx
number
```
Inserts a layer at a specified index


  
### filter

```tsx
FilterExpression
```
Filter only the features in the source layer that satisfy a condition that you define


  
### minZoomLevel

```tsx
number
```
The minimum zoom level at which the layer gets parsed and appears.


  
### maxZoomLevel

```tsx
number
```
The maximum zoom level at which the layer gets parsed and appears.


  
### style

```tsx
LineLayerStyleProps
```
Customizable style attributes


  






## styles

* <a href="#linecap">lineCap</a><br/>
* <a href="#linejoin">lineJoin</a><br/>
* <a href="#linemiterlimit">lineMiterLimit</a><br/>
* <a href="#lineroundlimit">lineRoundLimit</a><br/>
* <a href="#linesortkey">lineSortKey</a><br/>
* <a href="#visibility">visibility</a><br/>
* <a href="#lineopacity">lineOpacity</a><br/>
* <a href="#linecolor">lineColor</a><br/>
* <a href="#linetranslate">lineTranslate</a><br/>
* <a href="#linetranslateanchor">lineTranslateAnchor</a><br/>
* <a href="#linewidth">lineWidth</a><br/>
* <a href="#linegapwidth">lineGapWidth</a><br/>
* <a href="#lineoffset">lineOffset</a><br/>
* <a href="#lineblur">lineBlur</a><br/>
* <a href="#linedasharray">lineDasharray</a><br/>
* <a href="#linepattern">linePattern</a><br/>
* <a href="#linegradient">lineGradient</a><br/>
* <a href="#linetrimoffset">lineTrimOffset</a><br/>

___

### lineCap
Name: `lineCap`

### Description
The display of line endings.

### Type
`enum`
### Default Value
`butt`

### Supported Values
**butt** - A cap with a squared-off end which is drawn to the exact endpoint of the line.<br />
**round** - A cap with a rounded end which is drawn beyond the endpoint of the line at a radius of one-half of the line's width and centered on the endpoint of the line.<br />
**square** - A cap with a squared-off end which is drawn beyond the endpoint of the line at a distance of one-half of the line's width.<br />


### Expression

Parameters: `zoom, feature`

___

### lineJoin
Name: `lineJoin`

### Description
The display of lines when joining.

### Type
`enum`
### Default Value
`miter`

### Supported Values
**bevel** - A join with a squared-off end which is drawn beyond the endpoint of the line at a distance of one-half of the line's width.<br />
**round** - A join with a rounded end which is drawn beyond the endpoint of the line at a radius of one-half of the line's width and centered on the endpoint of the line.<br />
**miter** - A join with a sharp, angled corner which is drawn with the outer sides beyond the endpoint of the path until they meet.<br />


### Supported Style Functions
`camera`
### Expression

Parameters: `zoom, feature`

___

### lineMiterLimit
Name: `lineMiterLimit`

### Description
Used to automatically convert miter joins to bevel joins for sharp angles.

### Type
`number`
### Default Value
`2`


### Expression

Parameters: `zoom`

___

### lineRoundLimit
Name: `lineRoundLimit`

### Description
Used to automatically convert round joins to miter joins for shallow angles.

### Type
`number`
### Default Value
`1.05`


### Expression

Parameters: `zoom`

___

### lineSortKey
Name: `lineSortKey`

### Description
Sorts features in ascending order based on this value. Features with a higher sort key will appear above features with a lower sort key.

### Type
`number`


### Expression

Parameters: `zoom, feature`

___

### visibility
Name: `visibility`

### Description
Whether this layer is displayed.

### Type
`enum`
### Default Value
`visible`

### Supported Values
**visible** - The layer is shown.<br />
**none** - The layer is not shown.<br />



___

### lineOpacity
Name: `lineOpacity`

### Description
The opacity at which the line will be drawn.

### Type
`number`
### Default Value
`1`

### Minimum
`0`


### Maximum
`1`

### Expression

Parameters: `zoom, feature, feature-state`
___

### Name

`lineOpacityTransition`

### Description

The transition affecting any changes to this layer’s lineOpacity property.

### Type

`{ duration, delay }`

### Units
`milliseconds`

### Default Value
`{duration: 300, delay: 0}`


___

### lineColor
Name: `lineColor`

### Description
The color with which the line will be drawn.

### Type
`color`
### Default Value
`#000000`


### Disabled By
`linePattern`

### Expression

Parameters: `zoom, feature, feature-state`
___

### Name

`lineColorTransition`

### Description

The transition affecting any changes to this layer’s lineColor property.

### Type

`{ duration, delay }`

### Units
`milliseconds`

### Default Value
`{duration: 300, delay: 0}`


___

### lineTranslate
Name: `lineTranslate`

### Description
The geometry's offset. Values are [x, y] where negatives indicate left and up, respectively.

### Type
`array<number>`
### Default Value
`[0,0]`

### Units
`pixels`


### Expression

Parameters: `zoom`
___

### Name

`lineTranslateTransition`

### Description

The transition affecting any changes to this layer’s lineTranslate property.

### Type

`{ duration, delay }`

### Units
`milliseconds`

### Default Value
`{duration: 300, delay: 0}`


___

### lineTranslateAnchor
Name: `lineTranslateAnchor`

### Description
Controls the frame of reference for `lineTranslate`.

### Type
`enum`
### Default Value
`map`

### Supported Values
**map** - The line is translated relative to the map.<br />
**viewport** - The line is translated relative to the viewport.<br />


### Requires
`lineTranslate`

### Expression

Parameters: `zoom`

___

### lineWidth
Name: `lineWidth`

### Description
Stroke thickness.

### Type
`number`
### Default Value
`1`

### Units
`pixels`

### Minimum
`0`


### Supported Style Functions
`camera`
### Expression

Parameters: `zoom, feature, feature-state`
___

### Name

`lineWidthTransition`

### Description

The transition affecting any changes to this layer’s lineWidth property.

### Type

`{ duration, delay }`

### Units
`milliseconds`

### Default Value
`{duration: 300, delay: 0}`


___

### lineGapWidth
Name: `lineGapWidth`

### Description
Draws a line casing outside of a line's actual path. Value indicates the width of the inner gap.

### Type
`number`
### Default Value
`0`

### Units
`pixels`

### Minimum
`0`


### Expression

Parameters: `zoom, feature, feature-state`
___

### Name

`lineGapWidthTransition`

### Description

The transition affecting any changes to this layer’s lineGapWidth property.

### Type

`{ duration, delay }`

### Units
`milliseconds`

### Default Value
`{duration: 300, delay: 0}`


___

### lineOffset
Name: `lineOffset`

### Description
The line's offset. For linear features, a positive value offsets the line to the right, relative to the direction of the line, and a negative value to the left. For polygon features, a positive value results in an inset, and a negative value results in an outset.

### Type
`number`
### Default Value
`0`

### Units
`pixels`


### Expression

Parameters: `zoom, feature, feature-state`
___

### Name

`lineOffsetTransition`

### Description

The transition affecting any changes to this layer’s lineOffset property.

### Type

`{ duration, delay }`

### Units
`milliseconds`

### Default Value
`{duration: 300, delay: 0}`


___

### lineBlur
Name: `lineBlur`

### Description
Blur applied to the line, in pixels.

### Type
`number`
### Default Value
`0`

### Units
`pixels`

### Minimum
`0`


### Expression

Parameters: `zoom, feature, feature-state`
___

### Name

`lineBlurTransition`

### Description

The transition affecting any changes to this layer’s lineBlur property.

### Type

`{ duration, delay }`

### Units
`milliseconds`

### Default Value
`{duration: 300, delay: 0}`


___

### lineDasharray
Name: `lineDasharray`

### Description
Specifies the lengths of the alternating dashes and gaps that form the dash pattern. The lengths are later scaled by the line width. To convert a dash length to pixels, multiply the length by the current line width. Note that GeoJSON sources with `lineMetrics: true` specified won't render dashed lines to the expected scale. Also note that zoomDependent expressions will be evaluated only at integer zoom levels.

### Type
`array<number>`

### Units
`line widths`

### Minimum
`0`


### Disabled By
`linePattern`

### Expression

Parameters: `zoom, feature`

___

### linePattern
Name: `linePattern`

### Description
Name of image in sprite to use for drawing image lines. For seamless patterns, image width must be a factor of two (2, 4, 8, ..., 512). Note that zoomDependent expressions will be evaluated only at integer zoom levels.

### Type
`resolvedImage`


### Expression

Parameters: `zoom, feature`

___

### lineGradient
Name: `lineGradient`

### Description
Defines a gradient with which to color a line feature. Can only be used with GeoJSON sources that specify `"lineMetrics": true`.

### Type
`color`


### Disabled By
`linePattern`

### Expression

Parameters: `line-progress`

___

### lineTrimOffset
Name: `lineTrimOffset`

### Description
The line part between [trimStart, trimEnd] will be marked as transparent to make a route vanishing effect. The line trimOff offset is based on the whole line range [0.0, 1.0].

### Type
`array<number>`
### Default Value
`[0,0]`

### Minimum
`0,0`


### Maximum
`1,1`


