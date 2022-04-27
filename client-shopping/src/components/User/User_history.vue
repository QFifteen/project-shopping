<template>
<section class="history_all">
  <Card>
  <Row>
    <Col :span="16" push="1">
      <Icon class="iconfont-shopping shop-lishijilu" style="font-size: 18px;"/>
      <span class="history_text1">历史记录</span>
    </Col>
    <Col :span="8">
      <Input search placeholder="搜索历史记录..."  style="width:200px;"/>
      <Button type="primary" ghost style="margin-left: 20px">清空历史</Button>
    </Col>
  </Row>
  </Card>
  <Card>
    <Timeline>
      <TimelineItem color="green">
        <Card>
          <div class="shopping-history">
            <Row>
              <Col :span="4">
          <img src="../../assets/images/shopping/DM_20211115203702_017.png" alt="" width="60%">
              </Col>
              <Col :span="16">
                <span class="shopping_text1">雅鹿冬装加厚羽绒服</span>
                <p class="shopping_text2">2022-02-26 12:33:40</p>
              </Col>
              <Col :span="4" push="1">
                <div >
                <Icon class="iconfont-shopping shop-xiangxixinxi shopping_history_icon" />
                <Icon class="iconfont-shopping shop-shanchu shopping_history_icon"/>
                </div>
              </Col>
            </Row>
          </div>
        </Card>
      </TimelineItem>
      <TimelineItem color="green">
        <Card>
          <div class="shopping-history">
            <Row>
              <Col :span="4">
                <img src="../../assets/images/shopping/DM_20211115203702_017.png" alt="" width="60%">
              </Col>
              <Col :span="16">
                <span class="shopping_text1">雅鹿冬装加厚羽绒服</span>
                <p class="shopping_text2">2022-02-26 12:33:40</p>
              </Col>
              <Col :span="4" push="1">
                <div >
                  <Icon class="iconfont-shopping shop-xiangxixinxi shopping_history_icon" />
                  <Icon class="iconfont-shopping shop-shanchu shopping_history_icon"/>
                </div>
              </Col>
            </Row>
          </div>
        </Card>
      </TimelineItem>
      <TimelineItem color="red">
        <Card>
          <div class="shopping-history">
            <Row>
              <Col :span="4">
                <img src="../../assets/images/shopping/DM_20211115203702_017.png" alt="" width="60%">
              </Col>
              <Col :span="16">
                <span class="shopping_text1">雅鹿冬装加厚羽绒服</span>
                <p class="shopping_text2">2022-02-26 12:33:40</p>
              </Col>
              <Col :span="4" push="1">
                <div >
                  <Icon class="iconfont-shopping shop-xiangxixinxi shopping_history_icon" />
                  <Icon class="iconfont-shopping shop-shanchu shopping_history_icon"/>
                </div>
              </Col>
            </Row>
          </div>
        </Card>
      </TimelineItem>
      <TimelineItem color="blue">
      </TimelineItem>
    </Timeline>
    <Page :total="100" show-total />
  </Card>
</section>
</template>

<style lang="less" scoped>
@import "../../assets/css/User_history";
</style>

<script>
export default {
  name: "User_history",
  data(){
    return{

    }
  }
}
</script>

<style scoped>

</style>
