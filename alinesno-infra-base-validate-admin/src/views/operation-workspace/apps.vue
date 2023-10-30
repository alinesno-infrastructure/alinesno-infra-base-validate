<template>
  <div>
    <el-row class="acp-dashboard-panel" :gutter="20">
      <el-col class="panel-col" :span="19">
        <div class="grid-content">
          <div class="panel-header">
            <div class="header-title"><i class="fa-solid fa-link"></i> 应用集成说明</div>
          </div>
          <div class="panel-body" style="height: auto;position: relative;">
              <div class="direct-box">
                <ul>
                  <li class="box-item" v-for="item in directContent" :key="item">
                    <div class="dire-panel">
                      <div class="panel-title">
                        <img class="dire-panel-icon" :src="item.icon" :alt="item.name" />
                        {{ item.name }} 
                      </div>
                      <div class="panel-describe">{{ item.desc }}</div>
                      <div class="panel-tip">访问链接</div>
                    </div>
                  </li>
                </ul>
              </div>
          </div>
        </div>
      </el-col>
      <el-col :span="5">
        <div class="grid-content">
          <div class="panel-header">
            <div class="header-title"><i class="fa-solid fa-link"></i> 构建解决方案</div>
          </div>
          <div class="panel-body" style="height: auto;position: relative;">
            <div class="acp-app-list">
              <ul>
                <li class="app-items" style="width:100%" v-for="item in apps" :key="item">
                  <div class="app-icon">
                    <img :src="item.icon" :alt="item.name" />
                  </div>
                  <div class="app-info">
                    <div class="app-item-title">{{ item.name }} <i class="fa-solid fa-arrow-up-right-from-square"></i>
                    </div>
                    <div class="app-item desc">{{ item.desc }}</div>
                  </div>
                </li>
              </ul>
            </div>
          </div>

        </div>
      </el-col>
    </el-row>

  </div>
</template>

<script setup>

const directContent = ref([
  {
    "icon": "https://d1by4p17n947rt.cloudfront.net/icon/d88319dfa5d204f019b4284149886c59-7d586ea82f792b61a8c87de60565133d.svg",
    "name": "安全验证码架构",
    "desc": "安全验证码架构提供了一种可靠的验证机制，用于保护系统免受恶意攻击。通过使用安全验证码架构，您可以提高系统的安全性和可靠性。"
  },
  {
    "icon": "https://d1by4p17n947rt.cloudfront.net/icon/f5d2c00d40914bff4f82f29f9ef768bc-53a84099cf556710383a52b4612a8612.svg",
    "name": "集成图形验证码",
    "desc": "集成图形验证码是一种常用的验证方式，通过图形展示给用户一组随机字符或图像，要求用户正确识别并输入。"
  },
  {
    "icon": "https://d1by4p17n947rt.cloudfront.net/icon/3da5e8169d2f1426f99fbef54575fe96-6382cb2dfdd2f74c99bc8a64a338358e.svg",
    "name": "集成OTLP二次认证",
    "desc": "集成OTLP二次认证是一种强化身份验证的方法，通过在用户登录后引入第二个验证步骤，提供额外的安全层。"
  },
  {
    "icon": "https://d1by4p17n947rt.cloudfront.net/icon/fb0cde6228b21d89ec222b45efec54e7-0856e92285f4e7ed254b2588d1fe1829.svg",
    "name": "集成验证规则",
    "desc": "集成验证规则是一种用于验证用户输入或操作的规则集合，防止错误数据或恶意内容的提交，提高系统的数据完整性和安全性。"
  },
  {
    "icon": "https://d1by4p17n947rt.cloudfront.net/icon/a5ffe5487f62ef75d8e5cf78c18525a5-d4867f9d4adcd749f0c5aff987232847.svg",
    "name": "账户绑定二次认证",
    "desc": "通过绑定二次认证，用户需要提供额外的信息或使用其他验证方式，例如手机验证码、指纹识别或硬件令牌，以确保账户的安全性。"
  }
]);

const apps = ref([
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/051de32597041e41f73b97d61c67a13b-9cbdaf85e3bcf29b656fdedd8e6d1305.svg', name: '生物特征识别解决方案', desc: '生物特征识别解决方案' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/fb0cde6228b21d89ec222b45efec54e7-0856e92285f4e7ed254b2588d1fe1829.svg', name: '2FA二次认证解决方案', desc: '2FA二次认证解决方案' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/7177e919b32ad97825f95e902595014b-1594766d92813b5baeb706c453f91de0.svg', name: '服务端认证解决方案', desc: '非界面服务端认证解决方案' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/fb0cde6228b21d89ec222b45efec54e7-0856e92285f4e7ed254b2588d1fe1829.svg', name: '认证风险预警解决方案', desc: '认证风险预警解决方案' },
]);

</script>