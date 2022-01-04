<template>
  <div class="pic-zoom">
    <div
      class="preview-box"
      @mousemove="move($event)"
      @mouseleave="out"
      ref="previewBox"
      @mouseenter="enter"
    >
      <img :src="previewImg" style="width:350px">
      <div class="mask" ref="hoverBox" v-show="maskShow"></div>
    </div>
    <div class="zoom-box" v-show="zoomVisiable" ref="zoomBox">
      <img :src="zoomImg" ref="bigImg">
    </div>
  </div>
</template>
